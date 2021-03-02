import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-productos`
 *
 * VistaProductos element.
 *
 * @customElement
 * @polymer
 */
class VistaProductos extends PolymerElement {

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
        return 'vista-productos';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductos.is, VistaProductos);
