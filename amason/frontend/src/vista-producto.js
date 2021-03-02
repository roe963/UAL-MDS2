import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-producto`
 *
 * VistaProducto element.
 *
 * @customElement
 * @polymer
 */
class VistaProducto extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-producto';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProducto.is, VistaProducto);
