import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-productoscliente`
 *
 * VistaProductoscliente element.
 *
 * @customElement
 * @polymer
 */
class VistaProductoscliente extends PolymerElement {

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
        return 'vista-productoscliente';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductoscliente.is, VistaProductoscliente);
