import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-productosdelpedido`
 *
 * VistaProductosdelpedido element.
 *
 * @customElement
 * @polymer
 */
class VistaProductosdelpedido extends PolymerElement {

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
        return 'vista-productosdelpedido';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductosdelpedido.is, VistaProductosdelpedido);
