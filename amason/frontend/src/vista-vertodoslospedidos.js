import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-vertodoslospedidos`
 *
 * VistaVertodoslospedidos element.
 *
 * @customElement
 * @polymer
 */
class VistaVertodoslospedidos extends PolymerElement {

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
        return 'vista-vertodoslospedidos';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaVertodoslospedidos.is, VistaVertodoslospedidos);
